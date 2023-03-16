.class public Ly0/n0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/n0$b;,
        Ly0/n0$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:Ljava/util/Date;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;


# direct methods
.method private constructor <init>(IIJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly0/n0;->a:I

    iput p2, p0, Ly0/n0;->b:I

    iput-wide p3, p0, Ly0/n0;->c:J

    iput-object p5, p0, Ly0/n0;->d:Ljava/util/Date;

    iput-object p6, p0, Ly0/n0;->e:Ljava/lang/String;

    iput-object p7, p0, Ly0/n0;->f:Ljava/lang/String;

    iput-object p8, p0, Ly0/n0;->g:Ljava/lang/String;

    iput-object p9, p0, Ly0/n0;->h:Ljava/lang/String;

    iput-object p10, p0, Ly0/n0;->i:Ljava/lang/String;

    iput-object p11, p0, Ly0/n0;->j:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(IIJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly0/n0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Ly0/n0;-><init>(IIJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Ly0/n0;->c:J

    return-wide v0
.end method

.method public b()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Ly0/n0;->d:Ljava/util/Date;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ly0/n0;->b:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Ly0/n0;->a:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->j:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/n0;->i:Ljava/lang/String;

    return-object v0
.end method
