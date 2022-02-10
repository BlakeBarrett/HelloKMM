# Hello KMM!
Hello World in Kotlin Multiplatform Mobile (new empty project)

![KMM](https://cmota.github.io/kmp-codelabs/img/657b1858759b67ee.png)

## Getting started:
[Kotlinlang.org](Kotlinlang.org) hass instructions on getting you all setup from scratch; they can be found [here](https://kotlinlang.org/docs/kmm-getting-started.html#supported-platforms).

### Setup your environment.
Up to date instructions on how to configure your environment for KMM can be found on the [KMM website](https://kotlinlang.org/docs/kmm-setup.html).   

If you are a more visual learner, the Kotlin team published a good video tutorial on [YouTube](https://www.youtube.com/watch?v=GcqFhoUuNNI) titled, `"Your First Kotlin Multiplatform Mobile App Tutorial"`.

Alternatively, the TL;DR:
1. Install the latest Android Studio for your platform.
1. Install the latest Kotlin Multiplatform Mobile plugin.
1. Download the latest Xcode.
1. Install cocoapods:
    * `sudo gem install cocoapods`
1. Create a new KMM project, or clone this repository.
    * `git clone https://github.com/BlakeBarrett/HelloKMM.git`

### Housekeeping.
 * Its always good practice to add a good `.gitignore` file to any new repository.   
 I used [gitignore.io](gitignore.io) to generate the ignore files in this repository.

### Issues Getting Started
Seeing this?

```
'pod install' command failed with an exception:

 Cannot run program "pod" (in directory "/Users/svprdga/code/personal/kmm/Test/ios"): error=2, No such file or directory

        

        Possible reason: CocoaPods is not installed

        Please check that CocoaPods v1.10 or above and cocoapods-generate plugin are installed.

        

        To check CocoaPods version type 'pod --version' in the terminal

        

        To install CocoaPods execute 'sudo gem install cocoapods'

        To install cocoapod-generate execute 'sudo gem install cocoapods-generate'
```

There is an issue when building the project sometimes it will tell you the cocoapods is not installed when it, in fact, very much is -- this is not your problem, this is a permissions issue in Android Studio that [JetBrains is aware of](https://youtrack.jetbrains.com/issue/KT-50984#focus=Comments-27-5736461.0-0). Lucky for us, there is a simple enough fix/resolution.    
  * Launch a terminal and execute the following command   
    `chmod +x /Applications/Android\ Studio.app/Contents/bin/printenv`