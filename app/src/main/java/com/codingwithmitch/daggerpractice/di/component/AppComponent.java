package com.codingwithmitch.daggerpractice.di.component;

import android.app.Application;

import com.codingwithmitch.daggerpractice.BaseApplication;
import com.codingwithmitch.daggerpractice.di.module.ActivityBuilder;
import com.codingwithmitch.daggerpractice.di.module.AppModule;
import com.codingwithmitch.daggerpractice.di.module.ContextModule;
import com.codingwithmitch.daggerpractice.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

@Singleton
@Component(modules = {
        ContextModule.class,
        AppModule.class,
        AndroidSupportInjectionModule.class,
        ActivityBuilder.class,
        ViewModelModule.class
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}