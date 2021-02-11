import javax.inject.Inject

class UseViewModelFactory @Inject constructor(
    factoryMap: Map<Class<out ViewModel>, Factory>
) {
}