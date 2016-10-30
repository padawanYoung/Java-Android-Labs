package com.example.sergey.widget;

import android.content.Context;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.widget.RemoteViews;

public class MainActivity extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        // здесь ваш текст
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        // здесь ваш текст
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
        views.setTextViewText(R.id.tv, "АЛЛОХА!");
        appWidgetManager.updateAppWidget(appWidgetIds, views);

    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
        // здесь ваш текст
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        // здесь ваш текст
    }

}
