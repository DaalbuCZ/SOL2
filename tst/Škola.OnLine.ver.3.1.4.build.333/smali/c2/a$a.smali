.class public Lc2/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lc2/a$d;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J


# direct methods
.method public constructor <init>(Lc2/a$d;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/a$a;->a:Lc2/a$d;

    iput-wide p2, p0, Lc2/a$a;->b:J

    iput-wide p4, p0, Lc2/a$a;->c:J

    iput-wide p6, p0, Lc2/a$a;->d:J

    iput-wide p8, p0, Lc2/a$a;->e:J

    iput-wide p10, p0, Lc2/a$a;->f:J

    iput-wide p12, p0, Lc2/a$a;->g:J

    return-void
.end method

.method static synthetic a(Lc2/a$a;)J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->c:J

    return-wide v0
.end method

.method static synthetic b(Lc2/a$a;)J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->d:J

    return-wide v0
.end method

.method static synthetic c(Lc2/a$a;)J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->e:J

    return-wide v0
.end method

.method static synthetic g(Lc2/a$a;)J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->f:J

    return-wide v0
.end method

.method static synthetic j(Lc2/a$a;)J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->g:J

    return-wide v0
.end method


# virtual methods
.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h(J)Lc2/b0$a;
    .locals 13

    iget-object v0, p0, Lc2/a$a;->a:Lc2/a$d;

    invoke-interface {v0, p1, p2}, Lc2/a$d;->a(J)J

    move-result-wide v1

    iget-wide v3, p0, Lc2/a$a;->c:J

    iget-wide v5, p0, Lc2/a$a;->d:J

    iget-wide v7, p0, Lc2/a$a;->e:J

    iget-wide v9, p0, Lc2/a$a;->f:J

    iget-wide v11, p0, Lc2/a$a;->g:J

    invoke-static/range {v1 .. v12}, Lc2/a$c;->h(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lc2/b0$a;

    new-instance v3, Lc2/c0;

    invoke-direct {v3, p1, p2, v0, v1}, Lc2/c0;-><init>(JJ)V

    invoke-direct {v2, v3}, Lc2/b0$a;-><init>(Lc2/c0;)V

    return-object v2
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lc2/a$a;->b:J

    return-wide v0
.end method

.method public k(J)J
    .locals 1

    iget-object v0, p0, Lc2/a$a;->a:Lc2/a$d;

    invoke-interface {v0, p1, p2}, Lc2/a$d;->a(J)J

    move-result-wide p1

    return-wide p1
.end method
