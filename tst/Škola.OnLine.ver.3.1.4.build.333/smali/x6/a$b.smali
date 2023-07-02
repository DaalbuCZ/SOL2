.class public final Lx6/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ly6/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx6/a$a;)V
    .locals 0

    invoke-direct {p0}, Lx6/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx6/b;
    .locals 3

    iget-object v0, p0, Lx6/a$b;->a:Ly6/a;

    const-class v1, Ly6/a;

    invoke-static {v0, v1}, Lz7/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lx6/a;

    iget-object v1, p0, Lx6/a$b;->a:Ly6/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx6/a;-><init>(Ly6/a;Lx6/a$a;)V

    return-object v0
.end method

.method public b(Ly6/a;)Lx6/a$b;
    .locals 0

    invoke-static {p1}, Lz7/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly6/a;

    iput-object p1, p0, Lx6/a$b;->a:Ly6/a;

    return-object p0
.end method
