.class public final synthetic Lb2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/h;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/c;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb2/c;->a:Ljava/lang/Exception;

    check-cast p1, Lb2/w$a;

    invoke-static {v0, p1}, Lb2/g;->j(Ljava/lang/Exception;Lb2/w$a;)V

    return-void
.end method
