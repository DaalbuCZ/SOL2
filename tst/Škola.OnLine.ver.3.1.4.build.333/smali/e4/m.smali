.class public Le4/m;
.super Lf4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le4/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:J

.field private final r:J

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:I

.field private final v:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/h0;

    invoke-direct {v0}, Le4/h0;-><init>()V

    sput-object v0, Le4/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Lf4/a;-><init>()V

    iput p1, p0, Le4/m;->n:I

    iput p2, p0, Le4/m;->o:I

    iput p3, p0, Le4/m;->p:I

    iput-wide p4, p0, Le4/m;->q:J

    iput-wide p6, p0, Le4/m;->r:J

    iput-object p8, p0, Le4/m;->s:Ljava/lang/String;

    iput-object p9, p0, Le4/m;->t:Ljava/lang/String;

    iput p10, p0, Le4/m;->u:I

    iput p11, p0, Le4/m;->v:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lf4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Le4/m;->n:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget v0, p0, Le4/m;->o:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget v0, p0, Le4/m;->p:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget-wide v0, p0, Le4/m;->q:J

    const/4 v2, 0x4

    invoke-static {p1, v2, v0, v1}, Lf4/c;->k(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Le4/m;->r:J

    const/4 v2, 0x5

    invoke-static {p1, v2, v0, v1}, Lf4/c;->k(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Le4/m;->s:Ljava/lang/String;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lf4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Le4/m;->t:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-static {p1, v1, v0, v2}, Lf4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Le4/m;->u:I

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    iget v0, p0, Le4/m;->v:I

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Lf4/c;->i(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lf4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
