.class public final Lz3/i0;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/i0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final n:I

.field private final o:Landroid/accounts/Account;

.field private final p:I

.field private final q:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz3/j0;

    invoke-direct {v0}, Lz3/j0;-><init>()V

    sput-object v0, Lz3/i0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput p1, p0, Lz3/i0;->n:I

    iput-object p2, p0, Lz3/i0;->o:Landroid/accounts/Account;

    iput p3, p0, Lz3/i0;->p:I

    iput-object p4, p0, Lz3/i0;->q:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-void
.end method

.method public constructor <init>(Landroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1, p2, p3}, Lz3/i0;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lz3/i0;->n:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, La4/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lz3/i0;->o:Landroid/accounts/Account;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget v1, p0, Lz3/i0;->p:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, La4/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lz3/i0;->q:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
