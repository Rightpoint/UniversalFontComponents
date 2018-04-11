[DEPRECATED]

For platform 26 (Oreo) and above (also available in support library 26 and above), use the native Platform Components and fontFamily parameter.
For more information about font management :

https://developer.android.com/guide/topics/ui/look-and-feel/downloadable-fonts.html#programmatically

# UniversalFontComponents

*UniversalFontComponents* is a library that allows you to set a custom font in xml for all your TextViews.  You can also set a library-provided Roboto font  so that your fonts are consistent across different versions of Android.  

## Importing in your project

### Gradle

By standard Gradle use:

```
dependencies {
    compile 'com.raizlabs:UniversalFontComponents:1.0.1.1'
  }
```

## Usage
First, you have to initialize the library.

In your Application's onCreate method, call

```java
  UniversalFontComponents.init(this);
```

to initialize the FontMap.

Setting a universal font for your app can be done one of two ways:
  1. Use one of the library-provided roboto fonts, or
  2. Inject your own custom font into the view.

### Built-In Fonts

To use one of the built-in roboto fonts, use one of the built in views in your layout.xml file and add the universalFont attribute with one of the built-in Roboto fonts specified:

```xml
  <com.raizlabs.universalfontcomponents.widget.UniversalFontTextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="I am a UniversalFontTextView"
      app:universalFont="Roboto.Bold" />
```

### Custom Fonts

To use your own custom font:

  1. Add your custom font file to your app's asset folder (../src/main/assets/ExampleCustomFont.ttf)
  
  2. Use one of the built-in views in your layout.xml file and add the customFont attribute with the name of your custom font file specified:

    ```xml
      <com.raizlabs.universalfontcomponents.widget.UniversalFontTextView
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

## Maintainers

[Mervyn Anthony](https://github.com/Mervyn-Raizlabs)

[Dylan R. James](https://github.com/dylanrjames)
