/*
 * Copyright (C) 2010 Cyril Mottier (http://www.cyrilmottier.com)
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
package com.cyrilmottier.android.gdcatalog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import greendroid.app.GDListActivity;
import greendroid.widget.ItemAdapter;
import org.androidannotations.annotations.*;

@EActivity(R.layout.activity_custom_listview)
@OptionsMenu(R.menu.settings_action_provider)
public class CustomXmlItemActivity extends SherlockActivity {

    @ViewById(R.id.button)
    Button button;

    @ViewById(R.id.listView)
    ListView listView;

    @AfterViews
    public void initAfterViewInject() {
        this.setTitle("custom xml activity");
    }

    @Click(R.id.button)
    public void buttonOnClick(View view) {
        ItemAdapter adapter;
        try {
            adapter = ItemAdapter.createFromXml(this, R.xml.items);
            listView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
