package guice

import com.google.inject.Inject

@Inject
class MyClient(val warmer: Warmer) extends Client {
  warmer.trigger
}
