package com.code.avengers.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
* 1. Create a ViewHolder (aka Dhacha or Sachaa or Dye)
* 1a. Create XML file like single_language_view.xml
* 1b. Create a Class that extends to RecyclerView.ViewHolder
*
* 2. Come back to Adapter class. Extend this class (AdapterClass) like this:
*       "accessSpecifier class ClassName extends RecyclerView.Adapter<ViewHolderClass>"
*
* 3. You should get an error on the above. Alt + Enter on the Error line and
* choose "Implement Methods"
*
*
*
*
* Convert this Simple Java Class to a class which looks like
* an AdapterClass.
* */
public class LanguageAdapter extends RecyclerView.Adapter<SingleLanguageViewHolder>
{
    /*
    * You can never have context inside of a Non-Activity
    * */

    @NonNull
    @Override
    public SingleLanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        /*
        * Connect XML to this Java File
        * */
        // Below is the code replacement of setContentView(...);

        LayoutInflater layoutFileChaPainter = LayoutInflater.from(parent.getContext());
        View singleItemView = layoutFileChaPainter.inflate(R.layout.single_language_view, parent, false);

        SingleLanguageViewHolder viewHolder = new SingleLanguageViewHolder(singleItemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SingleLanguageViewHolder holder, int position)
    {
        Log.d("TAGME", "Current Visible Positions are " + position);
    }

    @Override
    public int getItemCount()
    {
        return 100;
    }
}
