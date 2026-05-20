#include <stdio.h>

// Iterative Binary Search Function
int binarySearch(int arr[], int n, int key)
{
    int low = 0, high = n - 1;

    while (low <= high)
    {
        int mid = (low + high) / 2;

        // Element found
        if (arr[mid] == key)
        {
            return mid;
        }

        // Search in right half
        if (arr[mid] < key)
        {
            low = mid + 1;
        }

        // Search in left half
        else
        {
            high = mid - 1;
        }
    }

    // Element not found
    return -1;
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

    int result = binarySearch(arr, n, key);

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