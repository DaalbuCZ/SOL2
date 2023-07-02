.class public final Lz2/u$b;
.super Lz2/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/s;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz2/s;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz2/s;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lz2/s;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method

.method public constructor <init>(Lz2/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/s;-><init>(Lz2/s;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lz2/u$b;
    .locals 1

    new-instance v0, Lz2/u$b;

    invoke-super {p0, p1}, Lz2/s;->a(Ljava/lang/Object;)Lz2/s;

    move-result-object p1

    invoke-direct {v0, p1}, Lz2/u$b;-><init>(Lz2/s;)V

    return-object v0
.end method
