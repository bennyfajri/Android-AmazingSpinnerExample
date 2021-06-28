
# Source

> Original Project Source by [](https://github.com/Mamoon-Alhawamdeh/AmazingSpinner).
<br>
<br>

## Example
<img src="https://github.com/bennyfajri/Android-AmazingSpinnerExample/blob/master/ss/ss1.png" alt="drawing" width="400" height="800"/>

## Source

> Original Project Source by **Mamoon-Alhawamdeh** <br> [Click Here](https://github.com/Mamoon-Alhawamdeh/AmazingSpinner).
<br>
<br>

## Implementation
#### Gradle
**Project** build.gradle
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**Module** build.gradle
```gradle
dependendies{
    ...
    implementation 'com.github.Mamoon-Alhawamdeh:AmazingSpinner:1.1.0'
}

```


## XML Code
Exmaple 1
```xml
 <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            style="@style/Widget.MaterialComponents.TextInputLayout.FilledBox.ExposedDropdownMenu">
            <com.rosemaryapp.amazingspinner.AmazingSpinner
                android:id="@+id/spinExample1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Jenis Kelamin"
                style="@style/Widget.MaterialComponents.AutoCompleteTextView.FilledBox"/>
 </com.google.android.material.textfield.TextInputLayout>
```

Exmaple 2
```xml
  <com.google.android.material.textfield.TextInputLayout
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_marginTop="16dp"
      style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox.ExposedDropdownMenu">
      <com.rosemaryapp.amazingspinner.AmazingSpinner
            android:id="@+id/spinExample2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Jenis Kelamin"
            style="@style/Widget.MaterialComponents.AutoCompleteTextView.OutlinedBox" />
  </com.google.android.material.textfield.TextInputLayout>
```

Exmaple 3
```xml
  <com.rosemaryapp.amazingspinner.AmazingSpinner
      android:id="@+id/spinExample3"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:hint="Jenis Kelamin"
      android:layout_marginTop="16dp"
      syle="@style/Widget.AppCompat.Spinner.Underlined"/>
```

Exmaple 4
```xml
  <com.google.android.material.textfield.TextInputLayout
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_marginTop="16dp">
      <com.rosemaryapp.amazingspinner.AmazingSpinner
          android:id="@+id/spinExample4"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:hint="Jenis Kelamin"
          style="@style/Widget.MaterialComponents.AutoCompleteTextView.FilledBox"/>
  </com.google.android.material.textfield.TextInputLayout>
```

