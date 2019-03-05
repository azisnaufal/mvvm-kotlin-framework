package radhika.yusuf.id.mvvmkotlin.mvvm.home.empty


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import radhika.yusuf.id.mvvmkotlin.R
import radhika.yusuf.id.mvvmkotlin.databinding.FragmentEmptyBinding
import radhika.yusuf.id.mvvmkotlin.utils.base.BaseFragment
import radhika.yusuf.id.mvvmkotlin.utils.chocohelper.ChocoBinding
import radhika.yusuf.id.mvvmkotlin.utils.chocohelper.ChocoChips
import radhika.yusuf.id.mvvmkotlin.utils.chocohelper.ChocoViewModel


class EmptyFragment : BaseFragment<EmptyViewModel>(), EmptyUserActionListener {

    @ChocoBinding(R.layout.fragment_empty)
    lateinit var mViewDataBinding: FragmentEmptyBinding

    @ChocoViewModel
    lateinit var mViewModel: EmptyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ChocoChips.inject<FragmentEmptyBinding, EmptyViewModel, EmptyUserActionListener>(this)
        return mViewDataBinding.root
    }

    override fun setContentData() {
        //get data from intent
    }

    override fun onCreateObserver(viewModel: EmptyViewModel) {

    }

    override fun onRefreshPage() {

    }

    override fun setMessageType(): String {
        return MESSAGE_TYPE_SNACK_CUSTOM
    }

    override fun onDestroyObserver(viewModel: EmptyViewModel) {

    }

    override fun onClickTest(text: String) {
        mViewModel.showMessage.value = text
    }

    companion object {
        fun newInstance() = EmptyFragment().apply {

        }

    }

}
