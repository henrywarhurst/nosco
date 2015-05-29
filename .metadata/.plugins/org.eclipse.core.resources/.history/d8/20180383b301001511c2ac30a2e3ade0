package com.example.nosco;

import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FacesLibrary extends ListActivity {
	private PeopleDataSource datasource;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faces_library);

		datasource = new PeopleDataSource(this);
		datasource.open();

		// create people list
		List<Person> data = datasource.getAllPeople();
		setListAdapter(new LibraryArrayAdapter(this, data));
	}

	public void runFd(View view) {
		Intent intent = new Intent(this, FdActivity.class);
		startActivity(intent);
	}

	public void addFace(View view) {
		Intent intent = new Intent(this, FaceDetails.class);
		// TODO: Remove these lines eventually
		intent.putExtra("firstname", "Cheng");
		intent.putExtra("lastname", "Holum");
		intent.putExtra("id", "33");
		startActivity(intent);
		// ADDS A PERSON TO THE PEOPLE SQLITE DB
		// @SuppressWarnings("unchecked")
		// ArrayAdapter<Person> adapter = (ArrayAdapter<Person>)
		// getListAdapter();
		// Person person = datasource.createPerson("Bob", "Weiner");
		// adapter.add(person);
		// adapter.notifyDataSetChanged();
	}

}