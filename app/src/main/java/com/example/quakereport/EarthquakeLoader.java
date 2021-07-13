package com.example.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

//AsyncTaskLoader<List<Earthquake>> indicates the return type of AsyncLoader is list Employee in loadBackground Method.
public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String url;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    //forceload is use to trigger the loader to start background work
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (url == null) {
            return null;
        }
        // Perform the network request, parse the response, and extract a list of earthquakes.
        return QueryUtils.fetchEarthquakeData(url);
    }
}