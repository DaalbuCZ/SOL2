.class public final Lt1/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Ls1/l3;

.field public final c:I

.field public final d:Lu2/u$b;

.field public final e:J

.field public final f:Ls1/l3;

.field public final g:I

.field public final h:Lu2/u$b;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(JLs1/l3;ILu2/u$b;JLs1/l3;ILu2/u$b;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lt1/c$a;->a:J

    iput-object p3, p0, Lt1/c$a;->b:Ls1/l3;

    iput p4, p0, Lt1/c$a;->c:I

    iput-object p5, p0, Lt1/c$a;->d:Lu2/u$b;

    iput-wide p6, p0, Lt1/c$a;->e:J

    iput-object p8, p0, Lt1/c$a;->f:Ls1/l3;

    iput p9, p0, Lt1/c$a;->g:I

    iput-object p10, p0, Lt1/c$a;->h:Lu2/u$b;

    iput-wide p11, p0, Lt1/c$a;->i:J

    iput-wide p13, p0, Lt1/c$a;->j:J

    return-void
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

    const-class v2, Lt1/c$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lt1/c$a;

    iget-wide v2, p0, Lt1/c$a;->a:J

    iget-wide v4, p1, Lt1/c$a;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lt1/c$a;->c:I

    iget v3, p1, Lt1/c$a;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt1/c$a;->e:J

    iget-wide v4, p1, Lt1/c$a;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lt1/c$a;->g:I

    iget v3, p1, Lt1/c$a;->g:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt1/c$a;->i:J

    iget-wide v4, p1, Lt1/c$a;->i:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt1/c$a;->j:J

    iget-wide v4, p1, Lt1/c$a;->j:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lt1/c$a;->b:Ls1/l3;

    iget-object v3, p1, Lt1/c$a;->b:Ls1/l3;

    invoke-static {v2, v3}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt1/c$a;->d:Lu2/u$b;

    iget-object v3, p1, Lt1/c$a;->d:Lu2/u$b;

    invoke-static {v2, v3}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt1/c$a;->f:Ls1/l3;

    iget-object v3, p1, Lt1/c$a;->f:Ls1/l3;

    invoke-static {v2, v3}, La5/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt1/c$a;->h:Lu2/u$b;

    iget-object p1, p1, Lt1/c$a;->h:Lu2/u$b;

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

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lt1/c$a;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lt1/c$a;->b:Ls1/l3;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lt1/c$a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lt1/c$a;->d:Lu2/u$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt1/c$a;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lt1/c$a;->f:Ls1/l3;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget v1, p0, Lt1/c$a;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lt1/c$a;->h:Lu2/u$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt1/c$a;->i:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt1/c$a;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
