.class public final Le4/b1;
.super Lf4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le4/b1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field n:Landroid/os/Bundle;

.field o:[Lb4/d;

.field p:I

.field q:Le4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/c1;

    invoke-direct {v0}, Le4/c1;-><init>()V

    sput-object v0, Le4/b1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf4/a;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;[Lb4/d;ILe4/e;)V
    .locals 0

    invoke-direct {p0}, Lf4/a;-><init>()V

    iput-object p1, p0, Le4/b1;->n:Landroid/os/Bundle;

    iput-object p2, p0, Le4/b1;->o:[Lb4/d;

    iput p3, p0, Le4/b1;->p:I

    iput-object p4, p0, Le4/b1;->q:Le4/e;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lf4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Le4/b1;->n:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lf4/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Le4/b1;->o:[Lb4/d;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lf4/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Le4/b1;->p:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Le4/b1;->q:Le4/e;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Lf4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lf4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
