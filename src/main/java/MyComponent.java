import dagger.Component;

import javax.inject.Singleton;
import java.util.Map;

@Singleton
@Component(modules = MyModule.class)
interface MyComponent {
    Map<Class<? extends ViewModel>, Factory> viewModelFactory();

    UseViewModelFactory useViewModelFactory();
}
