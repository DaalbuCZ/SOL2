.class public final Lb4/c0;
.super Lf4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb4/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Z

.field private final o:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final p:I

.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/d0;

    invoke-direct {v0}, Lb4/d0;-><init>()V

    sput-object v0, Lb4/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Lf4/a;-><init>()V

    iput-boolean p1, p0, Lb4/c0;->n:Z

    iput-object p2, p0, Lb4/c0;->o:Ljava/lang/String;

    invoke-static {p3}, Lb4/k0;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lb4/c0;->p:I

    invoke-static {p4}, Lb4/p;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lb4/c0;->q:I

    return-void
.end method


# virtual methods
.method public final k()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lb4/c0;->o:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lb4/c0;->n:Z

    return v0
.end method

.method public final v()I
    .locals 1

    iget v0, p0, Lb4/c0;->q:I

    invoke-static {v0}, Lb4/p;->a(I)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lf4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Lb4/c0;->n:Z

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lf4/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lb4/c0;->o:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lf4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lb4/c0;->p:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget v0, p0, Lb4/c0;->q:I

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lf4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lb4/c0;->p:I

    invoke-static {v0}, Lb4/k0;->a(I)I

    move-result v0

    return v0
.end method
