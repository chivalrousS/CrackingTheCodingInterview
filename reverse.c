#inlcude <stdio.h>
/*
实现reverse函数，即反转一个null结尾的字符串
*/
void reverse(char* str)
{
    char* end = str;
    char tmp;
    if(str)
    {
        while(*end != '\0')
            ++end;
    }
    --end;
    while(str < end)
    {
        tmp = *str;
        *str = *end;
        *end = tmp;
        ++str;--end;
    }
}
