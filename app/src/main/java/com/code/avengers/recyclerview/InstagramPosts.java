package com.code.avengers.recyclerview;

public class InstagramPosts
{
    private String profilePicture;

    private String username;

    private String location;

    private boolean isAlreadyLiked;

    private String shareUrl;

    String likedBy;

    public String getProfilePicture()
    {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture)
    {
        this.profilePicture = profilePicture;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public boolean isAlreadyLiked()
    {
        return isAlreadyLiked;
    }

    public void setAlreadyLiked(boolean alreadyLiked)
    {
        isAlreadyLiked = alreadyLiked;
    }

    public String getShareUrl()
    {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl)
    {
        this.shareUrl = shareUrl;
    }

    public String getLikedBy()
    {
        return likedBy;
    }

    public void setLikedBy(String likedBy)
    {
        this.likedBy = likedBy;
    }
}
