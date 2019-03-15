package radhika.yusuf.id.mvvmkotlin.data.source.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import radhika.yusuf.id.mvvmkotlin.data.model.HeroesModel
import radhika.yusuf.id.mvvmkotlin.data.source.DataSource

/**
 * Created by radhikayusuf on 17/11/2018.
 */
object RemoteDataSource : DataSource {

    private val mApiService: ApiService by lazy {
        ApiService.getApiService
    }

    override fun getListHeroes(refresh: Boolean, callback: DataSource.GetHeroesCallback) {
        GlobalScope.launch(Dispatchers.Main){
            val request = mApiService.getListHeroes()
            try {
                val response = request.await()
                if (response.data != null) {
                    if (response.data.isNotEmpty()) {
                        callback.onSuccess(response.data)
                    } else {
                        callback.onError(response.message)
                    }
                } else {
                    callback.onError(response.message)
                }
            } catch (e: Throwable){
                callback.onError("Oops something went wrong...")
            }
            callback.onFinish()
        }
//        mApiService.getListHeroes()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(object : ApiCallback<BaseApiModel<List<HeroesModel>?>>() {
//                override fun onSuccess(model: BaseApiModel<List<HeroesModel>?>) {
//                    if (model.data != null) {
//                        if (model.data.isNotEmpty()) {
//                            callback.onSuccess(model.data)
//                        } else {
//                            callback.onError(model.message)
//                        }
//                    } else {
//                        callback.onError(model.message)
//                    }
//                }
//
//                override fun onFailure(code: Int, errorMessage: String) {
//                    callback.onError(errorMessage)
//                }
//
//                override fun onFinish() {
//                    callback.onFinish()
//                }
//
//            })
    }

    override fun saveListHeroes(data: List<HeroesModel>) {

    }



}