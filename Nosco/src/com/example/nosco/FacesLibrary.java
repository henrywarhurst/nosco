package com.example.nosco;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FacesLibrary extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faces_library);
		// create employee list
		List<Face> data = new ArrayList<Face>();

		data.add(new Face("Paul Viola", "viola"));
		data.add(new Face("Michael Jones", "jones"));
		data.add(new Face("Ronald Fischer", "fischer"));
		// this is final step.i create EmployerArrayAdapter with this context
		// and data list and set it as ListAdapter
		setListAdapter(new LibraryArrayAdapter(this, data));
	}
	
	public void runFd(View view) {
		Intent intent = new Intent(this, FdActivity.class);
		startActivity(intent);
	}
	
	public void addFace(View view) {
		Intent intent = new Intent(this, SnapFace.class);
		startActivity(intent);
	}
}