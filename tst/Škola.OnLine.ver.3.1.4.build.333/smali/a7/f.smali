.class public La7/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La7/f$a;
    }
.end annotation


# direct methods
.method public static a([Landroid/util/SparseIntArray;)La7/f$a;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    aget-object p0, p0, v0

    if-eqz p0, :cond_3

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result v4

    if-ge v0, v4, :cond_2

    invoke-virtual {p0, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v4

    invoke-virtual {p0, v0}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v5

    add-int/2addr v1, v5

    const/16 v6, 0x2bc

    if-le v4, v6, :cond_0

    add-int/2addr v3, v5

    :cond_0
    const/16 v6, 0x10

    if-le v4, v6, :cond_1

    add-int/2addr v2, v5

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v2, v0

    move v3, v2

    :goto_1
    new-instance p0, La7/f$a;

    invoke-direct {p0, v0, v2, v3}, La7/f$a;-><init>(III)V

    return-object p0
.end method
