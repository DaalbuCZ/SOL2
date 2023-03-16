.class public final synthetic Lo1/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/m0$b;


# instance fields
.field public final synthetic a:Lo1/m0;

.field public final synthetic b:Lg1/p;


# direct methods
.method public synthetic constructor <init>(Lo1/m0;Lg1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/n;->a:Lo1/m0;

    iput-object p2, p0, Lo1/n;->b:Lg1/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo1/n;->a:Lo1/m0;

    iget-object v1, p0, Lo1/n;->b:Lg1/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lo1/m0;->G(Lo1/m0;Lg1/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
