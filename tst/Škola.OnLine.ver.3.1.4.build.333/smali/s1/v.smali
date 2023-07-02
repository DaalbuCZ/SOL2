.class public final synthetic Ls1/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Ls1/w;


# direct methods
.method public synthetic constructor <init>(Ls1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/v;->a:Ls1/w;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/v;->a:Ls1/w;

    invoke-static {v0}, Ls1/w;->a(Ls1/w;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
