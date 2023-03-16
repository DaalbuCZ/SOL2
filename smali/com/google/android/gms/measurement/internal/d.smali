.class public final Lcom/google/android/gms/measurement/internal/d;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Lcom/google/android/gms/measurement/internal/d9;

.field public q:J

.field public r:Z

.field public s:Ljava/lang/String;

.field public final t:Lcom/google/android/gms/measurement/internal/v;

.field public u:J

.field public v:Lcom/google/android/gms/measurement/internal/v;

.field public final w:J

.field public final x:Lcom/google/android/gms/measurement/internal/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/e;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/d;)V
    .locals 2

    invoke-direct {p0}, La4/a;-><init>()V

    invoke-static {p1}, Lz3/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/d;->q:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/d;->q:J

    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/d;->r:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->t:Lcom/google/android/gms/measurement/internal/v;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->t:Lcom/google/android/gms/measurement/internal/v;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/d;->u:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/d;->u:J

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/d;->w:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/d;->w:J

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/d9;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/v;JLcom/google/android/gms/measurement/internal/v;JLcom/google/android/gms/measurement/internal/v;)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/d;->q:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/d;->t:Lcom/google/android/gms/measurement/internal/v;

    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/d;->u:J

    iput-object p11, p0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iput-wide p12, p0, Lcom/google/android/gms/measurement/internal/d;->w:J

    iput-object p14, p0, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, La4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, La4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/d;->q:J

    const/4 v4, 0x5

    invoke-static {p1, v4, v1, v2}, La4/c;->k(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    const/4 v2, 0x6

    invoke-static {p1, v2, v1}, La4/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, La4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->t:Lcom/google/android/gms/measurement/internal/v;

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/d;->u:J

    const/16 v4, 0x9

    invoke-static {p1, v4, v1, v2}, La4/c;->k(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/d;->w:J

    const/16 v4, 0xb

    invoke-static {p1, v4, v1, v2}, La4/c;->k(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, La4/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
