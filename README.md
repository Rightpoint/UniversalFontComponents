# UniversalFontComponents

*UniversalFontComponents* is a library that allows you to set a custom font from xml for all your TextViews so that your fonts are consistent across different versions of Android.  

## Usage
Before you can use the universal font components, you have to initialize the FontMap.  FontMap keeps a collection of the built-in Roboto fonts mapped to enum values as well as a collection of custom fonts mapped to asset path names for faster loading.

In your Application's onCreate method, call

```java
  FontMap.init(this);
```

to initialize the FontMap.

Setting a universal font for your app can be done one of two ways:
  1. Use one of the library-provided roboto fonts, or
  2. Inject your own custom font into the view.

To use one of the built-in roboto fonts:
  1. Use one of the built in views in your layout.xml file:

```xml
  <com.raizlabs.universalfontwidgets.widgets.UniversalFontTextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="I am a UniversalFontTextView" />

```
  2.Add the universalFont attribute to the view and specify one of the built-in Roboto fonts
```xml
      app:universalFont="Roboto.Bold"
```

To use your own custom font:
  1. Use one of the built-in views in your layout.xml file:

    ```xml
  <com.raizlabs.universalfontwidgets.widgets.UniversalFontTextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="I am a UniversalFontTextView" />

    ```
  2. Add your custom font file to your app's asset folder
  3. Add the customFont attribute to the view and specify the name of your font file:

```xml
      app:customFont="CustomFont.ttf"
```

The following components are currently supported by the library:
  * TextView
  * Button
  * EditText
  * RadioButton
  * CheckBox

## Importing
To use this library:
  1. Create a Libraries folder in your Android project.
  2. Clone this repository into the Libraries folder.
  3. In Android Studio, right-click on the top-level project module and click on Open Module Settings
  
    ![ScreenshotMenu] (/Screenshot_Menu_Modules.png)

  4. Click on the '+' sign on the top left to add a module
