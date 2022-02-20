# leak-canary
Plain app to demonstrate Leak Canary library in order to determine possible memory leaks

**Leak Canary**

<img src="https://github.com/raheemadamboev/leak-canary/blob/master/android.jpg" />

Memory leaks can crash or decrease the performance of our Android applications. Using Leak Canary tool we can find those memory leaks and take action. In this app, I intentionally stored activity context in companion object (or in static field in Java) in order to cause memory leak so that we can use Leak Canary.

<a href="https://github.com/raheemadamboev/leak-canary/blob/master/app-debug.apk">Download demo</a>
