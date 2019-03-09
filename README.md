# mvvm-kotlin-framework

Framework with MVVM design pattern
- This Framework refers to google-sample mvvm
- This framework works well with this template: https://github.com/azisnaufal/android-template

#### Setting up this framework

1. Install this template https://github.com/azisnaufal/android-template
2. Clone this project, and open it from your Android Studio.
3. Wait until the gradle finish.
4. Update any outdated plugin, build tools, etc.
5. If you need to change the package name : https://stackoverflow.com/questions/16804093/rename-package-in-android-studio

#### Adding an activity

1. Uncheck "Compact Middle Packages" 

   ![disable_compact_middle_packaged.png](https://i.imgur.com/tS1ybmf.png)
2. Right click on mvvm package, New -> Package, give your activity package
3. Right click on your package, New -> Other , then pick what kind of activity you need.
4. Open utils.helper.ViewModelFactory    
5. Assign your ViewModel upper or below   
   `isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(mApplication)`

## Known issues

1. After adding new activity from template, Android Studio will mark some identifiers as invalid. To fix this issue, just rebuild the project
2. Android gradle version cannot be upgraded. We're stuck with 3.1.4 because the last stable version of com.android.databinding:compiler is 3.1.4 

## Contributing

Bug reports and pull requests are welcome on GitHub at [https://github.com/azisnaufal/mvvm-kotlin-framework](https://github.com/azisnaufal/mvvm-kotlin-framework).

## License

The project is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).
