.class public final Ls1/p2$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/p2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final x:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/p2$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final p:I

.field public final q:Ls1/u1;

.field public final r:Ljava/lang/Object;

.field public final s:I

.field public final t:J

.field public final u:J

.field public final v:I

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls1/s2;->a:Ls1/s2;

    sput-object v0, Ls1/p2$e;->x:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILs1/u1;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/p2$e;->n:Ljava/lang/Object;

    iput p2, p0, Ls1/p2$e;->o:I

    iput p2, p0, Ls1/p2$e;->p:I

    iput-object p3, p0, Ls1/p2$e;->q:Ls1/u1;

    iput-object p4, p0, Ls1/p2$e;->r:Ljava/lang/Object;

    iput p5, p0, Ls1/p2$e;->s:I

    iput-wide p6, p0, Ls1/p2$e;->t:J

    iput-wide p8, p0, Ls1/p2$e;->u:J

    iput p10, p0, Ls1/p2$e;->v:I

    iput p11, p0, Ls1/p2$e;->w:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/p2$e;
    .locals 0

    invoke-static {p0}, Ls1/p2$e;->b(Landroid/os/Bundle;)Ls1/p2$e;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Ls1/p2$e;
    .locals 14

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v0, 0x1

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Ls1/u1;->w:Ls1/h$a;

    invoke-interface {v2, v0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Ls1/u1;

    :goto_0
    move-object v5, v0

    const/4 v0, 0x2

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    const/4 v0, 0x3

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    const/4 v0, 0x4

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    const/4 v0, 0x5

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    const/4 v0, 0x6

    invoke-static {v0}, Ls1/p2$e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    new-instance p0, Ls1/p2$e;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Ls1/p2$e;-><init>(Ljava/lang/Object;ILs1/u1;Ljava/lang/Object;IJJII)V

    return-object p0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/p2$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/p2$e;

    iget v2, p0, Ls1/p2$e;->p:I

    iget v3, p1, Ls1/p2$e;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/p2$e;->s:I

    iget v3, p1, Ls1/p2$e;->s:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/p2$e;->t:J

    iget-wide v4, p1, Ls1/p2$e;->t:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls1/p2$e;->u:J

    iget-wide v4, p1, Ls1/p2$e;->u:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Ls1/p2$e;->v:I

    iget v3, p1, Ls1/p2$e;->v:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/p2$e;->w:I

    iget v3, p1, Ls1/p2$e;->w:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls1/p2$e;->n:Ljava/lang/Object;

    iget-object v3, p1, Ls1/p2$e;->n:Ljava/lang/Object;

    invoke-static {v2, v3}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/p2$e;->r:Ljava/lang/Object;

    iget-object v3, p1, Ls1/p2$e;->r:Ljava/lang/Object;

    invoke-static {v2, v3}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/p2$e;->q:Ls1/u1;

    iget-object p1, p1, Ls1/p2$e;->q:Ls1/u1;

    invoke-static {v2, p1}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Ls1/p2$e;->n:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls1/p2$e;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/p2$e;->q:Ls1/u1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/p2$e;->r:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Ls1/p2$e;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls1/p2$e;->t:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls1/p2$e;->u:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Ls1/p2$e;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Ls1/p2$e;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
