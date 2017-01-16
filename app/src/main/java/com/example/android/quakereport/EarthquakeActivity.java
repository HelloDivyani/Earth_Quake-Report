/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake_Single> earthquakes = QueryUtils.extractEarthquakes();

/*        earthquakes.add(new EarthQuake_Single("12","San Francisco","13 jan"));
        earthquakes.add(new EarthQuake_Single("14","London","23 jan"));
        earthquakes.add(new EarthQuake_Single("14","Tokyo","12 jan"));
        earthquakes.add(new EarthQuake_Single("14","Mexico City","14 jan"));
        earthquakes.add(new EarthQuake_Single("14","Moscow","23 jan"));
        earthquakes.add(new EarthQuake_Single("14","Rio de Janeiro","12 jan"));
        earthquakes.add(new EarthQuake_Single("14","Paris","16 jan"));
        // Deleting all fake earthQuake
        **/



        // Now we need to create our own custom adapter
        // An adapter is an API whuch bridges the listview,spinner and grid View






        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);


        EarthquakeAdapter adapter =new EarthquakeAdapter(this,earthquakes);


        // Create a new {@link ArrayAdapter} of earthquakes
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        //        this, android.R.layout.simple_list_item_1, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
