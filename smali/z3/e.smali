.class public Lz3/e;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lz3/q;

.field private final o:Z

.field private final p:Z

.field private final q:[I

.field private final r:I

.field private final s:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz3/d1;

    invoke-direct {v0}, Lz3/d1;-><init>()V

    sput-object v0, Lz3/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lz3/q;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput-object p1, p0, Lz3/e;->n:Lz3/q;

    iput-boolean p2, p0, Lz3/e;->o:Z

    iput-boolean p3, p0, Lz3/e;->p:Z

    iput-object p4, p0, Lz3/e;->q:[I

    iput p5, p0, Lz3/e;->r:I

    iput-object p6, p0, Lz3/e;->s:[I

    return-void
.end method


# virtual methods
.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lz3/e;->p:Z

    return v0
.end method

.method public final D()Lz3/q;
    .locals 1

    iget-object v0, p0, Lz3/e;->n:Lz3/q;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lz3/e;->r:I

    return v0
.end method

.method public s()[I
    .locals 1

    iget-object v0, p0, Lz3/e;->q:[I

    return-object v0
.end method

.method public v()[I
    .locals 1

    iget-object v0, p0, Lz3/e;->s:[I

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lz3/e;->n:Lz3/q;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz3/e;->x()Z

    move-result p2

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, La4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz3/e;->C()Z

    move-result p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, La4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz3/e;->s()[I

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, La4/c;->j(Landroid/os/Parcel;I[IZ)V

    invoke-virtual {p0}, Lz3/e;->k()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, La4/c;->i(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz3/e;->v()[I

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, La4/c;->j(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lz3/e;->o:Z

    return v0
.end method
