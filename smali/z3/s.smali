.class public Lz3/s;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz3/m;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz3/w;

    invoke-direct {v0}, Lz3/w;-><init>()V

    sput-object v0, Lz3/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lz3/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, La4/a;-><init>()V

    iput p1, p0, Lz3/s;->n:I

    iput-object p2, p0, Lz3/s;->o:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final k()I
    .locals 1

    iget v0, p0, Lz3/s;->n:I

    return v0
.end method

.method public final s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz3/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz3/s;->o:Ljava/util/List;

    return-object v0
.end method

.method public final v(Lz3/m;)V
    .locals 1

    iget-object v0, p0, Lz3/s;->o:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz3/s;->o:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lz3/s;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lz3/s;->n:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, La4/c;->i(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lz3/s;->o:Ljava/util/List;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, La4/c;->q(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method