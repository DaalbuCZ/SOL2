.class public final Lr4/j;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr4/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final n:I

.field final o:Lz3/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr4/k;

    invoke-direct {v0}, Lr4/k;-><init>()V

    sput-object v0, Lr4/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILz3/i0;)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput p1, p0, Lr4/j;->n:I

    iput-object p2, p0, Lr4/j;->o:Lz3/i0;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lr4/j;->n:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, La4/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lr4/j;->o:Lz3/i0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
