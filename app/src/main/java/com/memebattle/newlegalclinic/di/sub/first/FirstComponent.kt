package com.memebattle.newlegalclinic.di.sub.first

import com.memebattle.newlegalclinic.di.sub.first.module.FirstModule
import dagger.Subcomponent

@Subcomponent(modules = [FirstModule::class])
@FirstScope
interface FirstComponent {
    @Subcomponent.Builder
    interface Builder {
        fun firstModule(firstModule: FirstModule): FirstComponent.Builder
        fun buid(): FirstComponent
    }
}