class Solution {
public:
    string longestPalindrome(string s) {
      int len = 0, n = s.length (), i = 0;

  string ans = "";

  while (i < n)
    {

      //odd
      int l = i, r = i;

      while (l >= 0 and r < n and (s[l] == s[r]))
	{

	  if ((r - l) + 1 > len)
	    {

	      len = (r - l) + 1;

	      ans = s.substr (l, ((r - l) + 1));
	    }

	  l--;

	  r++;
	}

      //even
      l = i, r = (i++) + 1;

      while (l >= 0 and r < n and (s[l] == s[r]))
	{

	  if ((r - l) + 1 > len)
	    {

	      len = (r - l) + 1;

	      ans = s.substr (l, ((r - l) + 1));
	    }

	  l--;

	  r++;
	}
    }


  return ans;

    }
};