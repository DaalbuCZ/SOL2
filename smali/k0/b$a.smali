.class public final Lk0/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Lk0/k;

.field d:Z

.field e:Z

.field f:J

.field g:J

.field h:Lk0/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk0/b$a;->a:Z

    iput-boolean v0, p0, Lk0/b$a;->b:Z

    sget-object v1, Lk0/k;->n:Lk0/k;

    iput-object v1, p0, Lk0/b$a;->c:Lk0/k;

    iput-boolean v0, p0, Lk0/b$a;->d:Z

    iput-boolean v0, p0, Lk0/b$a;->e:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lk0/b$a;->f:J

    iput-wide v0, p0, Lk0/b$a;->g:J

    new-instance v0, Lk0/c;

    invoke-direct {v0}, Lk0/c;-><init>()V

    iput-object v0, p0, Lk0/b$a;->h:Lk0/c;

    return-void
.end method


# virtual methods
.method public a()Lk0/b;
    .locals 1

    new-instance v0, Lk0/b;

    invoke-direct {v0, p0}, Lk0/b;-><init>(Lk0/b$a;)V

    return-object v0
.end method

.method public b(Lk0/k;)Lk0/b$a;
    .locals 0

    iput-object p1, p0, Lk0/b$a;->c:Lk0/k;

    return-object p0
.end method

.method public c(Z)Lk0/b$a;
    .locals 0

    iput-boolean p1, p0, Lk0/b$a;->e:Z

    return-object p0
.end method
