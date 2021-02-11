import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MyModule {

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel.class)
    @NonNull
    public abstract Factory firstFactory(FirstFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel.class)
    @NonNull
    public abstract Factory secondFactory(SecondFactory factory);
}
