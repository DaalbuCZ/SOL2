.class public final synthetic Lo1/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/m0$b;


# instance fields
.field public final synthetic a:Lo1/m0;

.field public final synthetic b:Lg1/i;

.field public final synthetic c:Lg1/p;


# direct methods
.method public synthetic constructor <init>(Lo1/m0;Lg1/i;Lg1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/l0;->a:Lo1/m0;

    iput-object p2, p0, Lo1/l0;->b:Lg1/i;

    iput-object p3, p0, Lo1/l0;->c:Lg1/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo1/l0;->a:Lo1/m0;

    iget-object v1, p0, Lo1/l0;->b:Lg1/i;

    iget-object v2, p0, Lo1/l0;->c:Lg1/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lo1/m0;->Z(Lo1/m0;Lg1/i;Lg1/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
