.class public final Lx1/c3$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:Ljava/lang/String;

.field private static final C:Ljava/lang/String;

.field private static final D:Ljava/lang/String;

.field public static final E:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/c3$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final p:I

.field public final q:Lx1/v1;

.field public final r:Ljava/lang/Object;

.field public final s:I

.field public final t:J

.field public final u:J

.field public final v:I

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->x:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->y:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->z:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->A:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->B:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->C:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/c3$e;->D:Ljava/lang/String;

    sget-object v0, Lx1/f3;->a:Lx1/f3;

    sput-object v0, Lx1/c3$e;->E:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILx1/v1;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/c3$e;->n:Ljava/lang/Object;

    iput p2, p0, Lx1/c3$e;->o:I

    iput p2, p0, Lx1/c3$e;->p:I

    iput-object p3, p0, Lx1/c3$e;->q:Lx1/v1;

    iput-object p4, p0, Lx1/c3$e;->r:Ljava/lang/Object;

    iput p5, p0, Lx1/c3$e;->s:I

    iput-wide p6, p0, Lx1/c3$e;->t:J

    iput-wide p8, p0, Lx1/c3$e;->u:J

    iput p10, p0, Lx1/c3$e;->v:I

    iput p11, p0, Lx1/c3$e;->w:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lx1/c3$e;
    .locals 0

    invoke-static {p0}, Lx1/c3$e;->b(Landroid/os/Bundle;)Lx1/c3$e;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Lx1/c3$e;
    .locals 14

    sget-object v0, Lx1/c3$e;->x:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Lx1/c3$e;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lx1/v1;->B:Lx1/h$a;

    invoke-interface {v2, v0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object v0

    check-cast v0, Lx1/v1;

    :goto_0
    move-object v5, v0

    sget-object v0, Lx1/c3$e;->z:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    sget-object v0, Lx1/c3$e;->A:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Lx1/c3$e;->B:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v0, Lx1/c3$e;->C:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    sget-object v0, Lx1/c3$e;->D:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    new-instance p0, Lx1/c3$e;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Lx1/c3$e;-><init>(Ljava/lang/Object;ILx1/v1;Ljava/lang/Object;IJJII)V

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

    const-class v2, Lx1/c3$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lx1/c3$e;

    iget v2, p0, Lx1/c3$e;->p:I

    iget v3, p1, Lx1/c3$e;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx1/c3$e;->s:I

    iget v3, p1, Lx1/c3$e;->s:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lx1/c3$e;->t:J

    iget-wide v4, p1, Lx1/c3$e;->t:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lx1/c3$e;->u:J

    iget-wide v4, p1, Lx1/c3$e;->u:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lx1/c3$e;->v:I

    iget v3, p1, Lx1/c3$e;->v:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx1/c3$e;->w:I

    iget v3, p1, Lx1/c3$e;->w:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lx1/c3$e;->n:Ljava/lang/Object;

    iget-object v3, p1, Lx1/c3$e;->n:Ljava/lang/Object;

    invoke-static {v2, v3}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lx1/c3$e;->r:Ljava/lang/Object;

    iget-object v3, p1, Lx1/c3$e;->r:Ljava/lang/Object;

    invoke-static {v2, v3}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lx1/c3$e;->q:Lx1/v1;

    iget-object p1, p1, Lx1/c3$e;->q:Lx1/v1;

    invoke-static {v2, p1}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lx1/c3$e;->n:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lx1/c3$e;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lx1/c3$e;->q:Lx1/v1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lx1/c3$e;->r:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lx1/c3$e;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Lx1/c3$e;->t:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Lx1/c3$e;->u:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Lx1/c3$e;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Lx1/c3$e;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Lf5/j;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
