#inlcude <stdio.h>
/*
ʵ��reverse����������תһ��null��β���ַ���
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
