#include <stdio.h>

// Recursive Binary Search Function
int binarySearch(int arr[], int low, int high, int key)
{
    if (low > high)
    {
        return -1; // Element not found
    }

    int mid = (low + high) / 2;

    // If element is found
    if (arr[mid] == key)
    {
        return mid;
    }

    // If key is smaller, search left half
    if (key < arr[mid])
    {
        return binarySearch(arr, low, mid - 1, key);
    }

    // If key is greater, search right half
    return binarySearch(arr, mid + 1, high, key);
}

int main()
{
    int n, key, i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter sorted elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter element to search: ");
    scanf("%d", &key);

    int result = binarySearch(arr, 0, n - 1, key);

    if (result != -1)
    {
        printf("Element found at position %d\n", result + 1);
    }
    else
    {
        printf("Element not found\n");
    }

    return 0;
}