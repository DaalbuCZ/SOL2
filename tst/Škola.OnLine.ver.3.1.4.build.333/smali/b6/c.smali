.class public final synthetic Lb6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj1/h;


# instance fields
.field public final synthetic a:Lb6/e;

.field public final synthetic b:Ly4/j;

.field public final synthetic c:Lv5/p;


# direct methods
.method public synthetic constructor <init>(Lb6/e;Ly4/j;Lv5/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/c;->a:Lb6/e;

    iput-object p2, p0, Lb6/c;->b:Ly4/j;

    iput-object p3, p0, Lb6/c;->c:Lv5/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lb6/c;->a:Lb6/e;

    iget-object v1, p0, Lb6/c;->b:Ly4/j;

    iget-object v2, p0, Lb6/c;->c:Lv5/p;

    invoke-static {v0, v1, v2, p1}, Lb6/e;->a(Lb6/e;Ly4/j;Lv5/p;Ljava/lang/Exception;)V

    return-void
.end method
