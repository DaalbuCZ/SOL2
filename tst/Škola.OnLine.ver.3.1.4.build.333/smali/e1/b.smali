.class public Le1/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ld1/b;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ld1/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le1/b;->a:I

    iput-object p2, p0, Le1/b;->b:Ljava/lang/String;

    iput-object p3, p0, Le1/b;->c:Ljava/lang/String;

    iput-object p4, p0, Le1/b;->d:Ld1/b;

    iput-object p5, p0, Le1/b;->e:Ljava/lang/String;

    iput-object p6, p0, Le1/b;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le1/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ld1/b;
    .locals 1

    iget-object v0, p0, Le1/b;->d:Ld1/b;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Le1/b;->a:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le1/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le1/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le1/b;->e:Ljava/lang/String;

    return-object v0
.end method
