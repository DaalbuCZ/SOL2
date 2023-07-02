.class public Ld1/l0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ld1/g0;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld1/g0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, p3}, Ld1/l0;->b(Ld1/g0;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Ld1/l0;->a:Ld1/g0;

    iput-object p2, p0, Ld1/l0;->b:Ljava/lang/String;

    iput-object p3, p0, Ld1/l0;->c:Ljava/lang/String;

    return-void
.end method

.method private b(Ld1/g0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Application must be not null"

    invoke-static {p1, v0}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Version name must be not null"

    invoke-static {p2, p1}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Version code must be not null"

    invoke-static {p3, p1}, Ld1/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static c(Ld1/g0;Ljava/lang/String;Ljava/lang/String;)Ld1/l0;
    .locals 1

    new-instance v0, Ld1/l0;

    invoke-direct {v0, p0, p1, p2}, Ld1/l0;-><init>(Ld1/g0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ld1/g0;
    .locals 1

    iget-object v0, p0, Ld1/l0;->a:Ld1/g0;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/l0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/l0;->b:Ljava/lang/String;

    return-object v0
.end method
