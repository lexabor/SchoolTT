package com.samschool.schooltt.pages;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.samschool.schooltt.pages.R;

public class PageFragment extends ListFragment {

    String testData[] = new String[]
            {"Математика", "Русский", "Английский", "Come", "On", "Mozafaka", "БИЧЕЗ", "everybody",
                    "COOL", "PROGRAMMER"};

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    int pageNumber;

    // Отображаемый день
 //   TTDay _currentDay;

    public static PageFragment newInstance(int page, TTDay day) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);

        //_currentDay = day;

        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;

        view = inflater.inflate(R.layout.monday_layout, null);

        switch (pageNumber){
            case 0:
//                view = inflater.inflate(R.layout.monday_layout, null);
//                setListAdapter(adapter);
                break;
            case 1:
//                view = inflater.inflate(R.layout.tuesday_layout, null);
//                setListAdapter(adapter);
                break;
            case 2:
//                view = inflater.inflate(R.layout.wednesday_layout, null);
//                setListAdapter(adapter);
                break;
            case 3:
//                view = inflater.inflate(R.layout.thursday_layout, null);
//                setListAdapter(adapter);
                break;
            case 4:
//                view = inflater.inflate(R.layout.friday_layout, null);
//                setListAdapter(adapter);
                break;
            case 5:
//                view = inflater.inflate(R.layout.saturday_layout, null);
//                setListAdapter(adapter);
                break;
        }

        // Заполнить уроки на день
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, testData);

        setListAdapter(adapter);

        return view;
    }
}