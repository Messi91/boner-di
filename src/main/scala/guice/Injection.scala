package guice

import com.google.inject.{Guice, Module}

trait ServiceInjector

object ServiceInjector {

  private val injector = Guice.createInjector(new DependencyModule)

  def inject(obj: AnyRef) = injector.injectMembers(obj)
}

object GuiceApp {

//  val client = new MyClient with ServiceInjector
}
