# UniversalFontComponents

*UniversalFontComponents* is a library that allows you to set a custom font in xml for all your TextViews.  You can also set a library-provided Roboto font  so that your fonts are consistent across different versions of Android.  

## Usage
First, you have to initialize the FontMap.  FontMap loads pre-built fonts into your app.

In your Application's onCreate method, call

```java
  FontMap.init(this);
```

to initialize the FontMap.

Setting a universal font for your app can be done one of two ways:
  1. Use one of the library-provided roboto fonts, or
  2. Inject your own custom font into the view.

### Built-In Fonts

To use one of the built-in roboto fonts, use one of the built in views in your layout.xml file and add the universalFont attribute with one of the built-in Roboto fonts specified :

```xml
  <com.raizlabs.universalfontwidgets.widgets.UniversalFontTextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="I am a UniversalFontTextView"
      app:universalFont="Roboto.Bold" />

```

### Custom Fonts

To use your own custom font:
  1.Add your custom font file to your app's asset folder (../src/main/assets/ExampleCustomFont.ttf)
  2. Use one of the built-in views in your layout.xml file and add the customFont attribute with the name of your custom font file specified:

    ```xml
  <com.raizlabs.universalfontwidgets.widgets.UniversalFontTextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="I am a UniversalFontTextView"
      app:customFont="ExampleCustomFont.ttf" />

    ```
The following components are currently provided by the library:
  * UniversalFontTextView
  * UniversalFontButton
  * UniversalFontEditText
  * UniversalFontRadioButton
  * UniversalFontCheckBox

## Importing
To use this library:
  1. Create a Libraries folder in your Android project.
  2. Clone this repository into the Libraries folder.
  3. In Android Studio, right-click on the top-level project module and click on Open Module Settings
  
    ![ScreenshotMenu] (/Screenshot_Menu_Modules.png)

  4. Click on the '+' sign on the top left to add a module
    ![ScreenshotAdd] (/Screenshot_Module_Settings.png)

  5. Under "More Modules", select "Import Existing Project" and click 'OK'
    ![ScreenshotImport] (/Screenshot_Import.png)

  6. Locate the directory for the library and click 'OK'
  7. Uncheck the import box for the sample and check the import box for the universalfontcomponents module and click 'OK'
  8. Select your _application_ module and click the Dependencies tab
    ![ScreenshotDependencies] (/Screenshot_Dependencies.png)

  9. Click the '+' on the bottom to add a dependency and select 'Module Dependency'

    ![ScreenshotModuleDependency] (/Screenshot_AddDependency.png)

  10. Select the universalfontcomponents module and click 'OK'
  11. Click 'OK' to exit Module Settings and sync your gradle files.

