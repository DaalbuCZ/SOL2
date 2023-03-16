.class public Lz3/q;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:I

.field private final o:Z

.field private final p:Z

.field private final q:I

.field private final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz3/u0;

    invoke-direct {v0}, Lz3/u0;-><init>()V

    sput-object v0, Lz3/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput p1, p0, Lz3/q;->n:I

    iput-boolean p2, p0, Lz3/q;->o:Z

    iput-boolean p3, p0, Lz3/q;->p:Z

    iput p4, p0, Lz3/q;->q:I

    iput p5, p0, Lz3/q;->r:I

    return-void
.end method


# virtual methods
.method public C()I
    .locals 1

    iget v0, p0, Lz3/q;->n:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lz3/q;->q:I

    return v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lz3/q;->r:I

    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lz3/q;->o:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lz3/q;->C()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, La4/c;->i(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz3/q;->v()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, La4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz3/q;->x()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, La4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz3/q;->k()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, La4/c;->i(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz3/q;->s()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, La4/c;->i(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lz3/q;->p:Z

    return v0
.end method
