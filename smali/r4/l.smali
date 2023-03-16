.class public final Lr4/l;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr4/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final n:I

.field private final o:Lw3/b;

.field private final p:Lz3/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr4/m;

    invoke-direct {v0}, Lr4/m;-><init>()V

    sput-object v0, Lr4/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILw3/b;Lz3/k0;)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput p1, p0, Lr4/l;->n:I

    iput-object p2, p0, Lr4/l;->o:Lw3/b;

    iput-object p3, p0, Lr4/l;->p:Lz3/k0;

    return-void
.end method


# virtual methods
.method public final k()Lw3/b;
    .locals 1

    iget-object v0, p0, Lr4/l;->o:Lw3/b;

    return-object v0
.end method

.method public final s()Lz3/k0;
    .locals 1

    iget-object v0, p0, Lr4/l;->p:Lz3/k0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lr4/l;->n:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, La4/c;->i(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lr4/l;->o:Lw3/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lr4/l;->p:Lz3/k0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
